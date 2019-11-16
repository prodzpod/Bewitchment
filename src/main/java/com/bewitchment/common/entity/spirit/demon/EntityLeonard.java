package com.bewitchment.common.entity.spirit.demon;

import com.bewitchment.Bewitchment;
import com.bewitchment.api.BewitchmentAPI;
import com.bewitchment.common.entity.util.ModEntityMob;
import com.bewitchment.registry.ModObjects;
import com.bewitchment.registry.ModPotions;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.AbstractIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.*;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class EntityLeonard extends ModEntityMob {
	private final BossInfoServer bossInfo = (BossInfoServer) (new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS)).setDarkenSky(false);
	
	protected EntityLeonard(World world) {
		super(world, new ResourceLocation(Bewitchment.MODID, "entities/leonard"));
		isImmuneToFire = true;
		setSize(1.0f, 3.8f);
	}
	
	@Override
	protected boolean isValidLightLevel() {
		return false;
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		if (this.hasCustomName()) {
			this.bossInfo.setName(this.getDisplayName());
		}
	}
	
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return BewitchmentAPI.DEMON;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (this.getHealth() < this.getMaxHealth() && !(ticksExisted % 200 > 5)) {
			this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 50, 0, false, true));
			world.playSound(null, getPosition(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.HOSTILE, 6, 1);
			this.swingArm(EnumHand.MAIN_HAND);
		}
		if (this.getHealth() / this.getMaxHealth() < 0.4) {
			this.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 0, false, true));
			world.playSound(null, getPosition(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.HOSTILE, 6, 1);
			this.swingArm(EnumHand.MAIN_HAND);
		}
		boolean buffed = ticksExisted % 600 > 5;
		if (!buffed) {
			if (!world.isRemote) {
				((WorldServer) world).spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, posX, posY, posZ, 128, width, height+1, width, 0.1);
				world.playSound(null, posX, posY, posZ, SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.HOSTILE, 5, 1);
			}
			this.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 300));
			this.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 300));
			this.addPotionEffect(new PotionEffect(MobEffects.SPEED, 300));
			this.swingArm(EnumHand.MAIN_HAND);
			return;
		}
		if (getAttackTarget() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) getAttackTarget();
			boolean launchFireball = ticksExisted % 100 > 5;
			if (!launchFireball && getDistance(player) > 4) {
				double d0 = getDistanceSq(player);
				double d1 = player.posX - this.posX;
				double d2 = player.getEntityBoundingBox().minY + (double)(player.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
				double d3 = player.posZ - this.posZ;
				float f = MathHelper.sqrt(MathHelper.sqrt(d0)) * 0.5F;
				world.playEvent(null, 1018, new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ), 0);
				EntitySmallFireball entitysmallfireball = new EntitySmallFireball(world, this, d1 + this.getRNG().nextGaussian() * (double)f, d2, d3 + this.getRNG().nextGaussian() * (double)f);
				entitysmallfireball.posY = posY + (double)(height / 2.0F) + 0.5D;
				world.spawnEntity(entitysmallfireball);
				this.swingArm(EnumHand.MAIN_HAND);
			}
		}
	}

	@Override
	public boolean isPotionApplicable(PotionEffect potioneffectIn) {
		return !potioneffectIn.getPotion().isBadEffect();
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(500);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(13.616);
	}
	
	public boolean isNonBoss() {
		return false;
	}
	
	public void setCustomNameTag(@NotNull String name) {
		super.setCustomNameTag(name);
		this.bossInfo.setName(this.getDisplayName());
	}
	
	public void addTrackingPlayer(EntityPlayerMP player) {
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}
	
	public void removeTrackingPlayer(EntityPlayerMP player) {
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		super.setEquipmentBasedOnDifficulty(difficulty);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ModObjects.leonards_wand));
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData data) {
		this.setEquipmentBasedOnDifficulty(difficulty);
		return super.onInitialSpawn(difficulty, data);
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		if (entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
			player.addPotionEffect(new PotionEffect(ModPotions.magic_weakness, 60, 0));
		}
		return super.attackEntityAsMob(entityIn);
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 0.5, false));
		tasks.addTask(2, new EntityAIWatchClosest2(this, EntityPlayer.class, 5, 1));
		tasks.addTask(3, new EntityAILookIdle(this));
		tasks.addTask(3, new EntityAIWanderAvoidWater(this, getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * (2 / 3d)));
		targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityLivingBase.class, 10, false, false, e -> e instanceof EntityVillager || e instanceof AbstractIllager || e instanceof EntityWitch || e instanceof EntityIronGolem));
	}
	
	protected void updateAITasks() {
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}
}