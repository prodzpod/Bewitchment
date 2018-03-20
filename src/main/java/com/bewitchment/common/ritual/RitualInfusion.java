package com.bewitchment.common.ritual;

import java.util.Optional;

import com.bewitchment.api.capability.IEnergy;
import com.bewitchment.api.capability.IInfusion;
import com.bewitchment.common.core.capability.energy.EnergyHandler;
import com.bewitchment.common.tile.TileEntityGlyph;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualInfusion extends RitualImpl {

	IInfusion type;

	public RitualInfusion(ResourceLocation registryName, NonNullList<Ingredient> input, NonNullList<ItemStack> output, int timeInTicks, int circles, int altarStartingPower, int powerPerTick, IInfusion type) {
		super(type.getRegistryName(), input, output, timeInTicks, circles, altarStartingPower, powerPerTick);
		this.type = type;
	}

	@Override
	public void onFinish(EntityPlayer player, TileEntityGlyph tile, World world, BlockPos pos, NBTTagCompound data) {
		if (player == null) {
			tile.stopRitual(null);
			return;
		}
		Optional<IEnergy> eng = EnergyHandler.getEnergy(player);
		if (eng.isPresent()) {
			IEnergy ien = eng.get();
			ien.setType(type);
			if (player instanceof EntityPlayerMP)
				ien.syncTo((EntityPlayerMP) player);
		}
	}

}
