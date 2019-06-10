package com.bewitchment.client.model.armor;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * witches_attire_4 - Ingoleth, cybercat5555
 * Created using Tabula 5.1.0
 */
@SuppressWarnings({"WeakerAccess", "NullableProblems"})
public class ModelWitchesArmor extends ModelArmor {
	private final boolean hat;
	
	public ModelRenderer legLeft;
	public ModelRenderer legRight;
	public ModelRenderer hat1;
	public ModelRenderer Body;
	public ModelRenderer hood01;
	public ModelRenderer tunicLeftBack;
	public ModelRenderer tunicLeftFront;
	public ModelRenderer tunicLeft;
	public ModelRenderer tunicLeftBack_1;
	public ModelRenderer tunicFront;
	public ModelRenderer tunicLeft_1;
	public ModelRenderer tunicRightFront;
	public ModelRenderer tunicRightBack;
	public ModelRenderer tunicRight;
	public ModelRenderer tunicRightFront_1;
	public ModelRenderer tunicRightBack_1;
	public ModelRenderer tunicRight_1;
	public ModelRenderer hat2;
	public ModelRenderer hatWing;
	public ModelRenderer hat3;
	public ModelRenderer armLeft;
	public ModelRenderer armRight;
	public ModelRenderer shoulderLeft;
	public ModelRenderer sleeveLeft;
	public ModelRenderer shoulderRight;
	public ModelRenderer sleeveRight;
	public ModelRenderer hoodFringe01;
	public ModelRenderer hoodFringeL01;
	public ModelRenderer hoodFringeR01;
	public ModelRenderer hoodFringeL02;
	public ModelRenderer hoodFringeR02;
	public ModelRenderer hoodFringeL03;
	public ModelRenderer hoodFringeR03;
	public ModelRenderer hoodShade;
	public ModelRenderer hoodFringeL04;
	public ModelRenderer hoodFringeR04;
	public ModelRenderer hoodPipe01;
	public ModelRenderer hoodPipe02;
	
	public ModelWitchesArmor(EntityEquipmentSlot slot, boolean hat) {
		super(slot);
		this.hat = hat;
		textureWidth = 128;
		textureHeight = 128;
		tunicLeftBack = new ModelRenderer(this, 53, 65);
		tunicLeftBack.setRotationPoint(2.01F, 0.0F, 2.1F);
		tunicLeftBack.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
		setRotateAngle(tunicLeftBack, 3.01941960595019F, 0.0F, 3.141592653589793F);
		tunicRightFront = new ModelRenderer(this, 53, 65);
		tunicRightFront.setRotationPoint(-1.99F, 0.0F, -2.1F);
		tunicRightFront.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
		setRotateAngle(tunicRightFront, -0.12217304763960307F, 0.0F, 0.0F);
		sleeveLeft = new ModelRenderer(this, 49, 98);
		sleeveLeft.setRotationPoint(1.01F, 10.1F, 2.0F);
		sleeveLeft.addBox(-4.0F, -4.0F, 0.0F, 4, 4, 2, 0.0F);
		setRotateAngle(sleeveLeft, 0.5235987755982988F, 0.0F, 0.0F);
		tunicRightFront_1 = new ModelRenderer(this, 53, 77);
		tunicRightFront_1.setRotationPoint(-0.01F, 10.0F, 1.0F);
		tunicRightFront_1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
		setRotateAngle(tunicRightFront_1, -0.2617993877991494F, 0.0F, 0.0F);
		Body = new ModelRenderer(this, 3, 81);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addBox(-4.0F, -0.01F, -2.0F, 8, 12, 4, 0.0F);
		legRight = new ModelRenderer(this, 0, 16);
		legRight.mirror = true;
		legRight.setRotationPoint(2.0F, 12.0F, 0.0F);
		legRight.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, 0.0F);
		shoulderLeft = new ModelRenderer(this, 0, 68);
		shoulderLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulderLeft.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		setRotateAngle(shoulderLeft, 0.0F, 3.141592653589793F, -0.08726646259971647F);
		hoodFringeL03 = new ModelRenderer(this, 97, 33);
		hoodFringeL03.setRotationPoint(5.15F, -0.7F, 0.1F);
		hoodFringeL03.addBox(-5.0F, -0.9F, -5.37F, 5, 2, 10, 0.0F);
		setRotateAngle(hoodFringeL03, 0.0F, 0.0F, -0.3141592653589793F);
		tunicRight_1 = new ModelRenderer(this, 23, 77);
		tunicRight_1.setRotationPoint(-0.01F, 10.0F, 1.0F);
		tunicRight_1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
		setRotateAngle(tunicRight_1, -0.2617993877991494F, 0.0F, 0.0F);
		armLeft = new ModelRenderer(this, 47, 81);
		armLeft.setRotationPoint(-5.0F, 2.0F, 0.0F);
		armLeft.addBox(-3.0F, -1.9F, -2.0F, 4, 12, 4, 0.0F);
		sleeveRight = new ModelRenderer(this, 49, 98);
		sleeveRight.setRotationPoint(0.99F, 10.1F, 2.0F);
		sleeveRight.addBox(-2.0F, -4.0F, 0.0F, 4, 4, 2, 0.0F);
		setRotateAngle(sleeveRight, 0.5235987755982988F, 0.0F, 0.0F);
		hoodFringeR04 = new ModelRenderer(this, 57, 20);
		hoodFringeR04.mirror = true;
		hoodFringeR04.setRotationPoint(-2.7F, -8.4F, 0.1F);
		hoodFringeR04.addBox(-0.9F, -1.0F, -5.38F, 4, 2, 11, 0.0F);
		setRotateAngle(hoodFringeR04, 0.0F, 0.0F, -0.3141592653589793F);
		hatWing = new ModelRenderer(this, 0, 112);
		hatWing.setRotationPoint(0.0F, -6.0F, 0.0F);
		hatWing.addBox(-6.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F);
		setRotateAngle(hatWing, 0.03490658503988659F, 0.0F, 0.06981317007977318F);
		hoodPipe01 = new ModelRenderer(this, 65, 43);
		hoodPipe01.setRotationPoint(0.0F, -7.0F, 4.2F);
		hoodPipe01.addBox(-3.0F, -2.5F, 0.0F, 6, 6, 4, 0.0F);
		setRotateAngle(hoodPipe01, -0.40142572795869574F, 0.0F, 0.0F);
		tunicFront = new ModelRenderer(this, 53, 77);
		tunicFront.setRotationPoint(-0.01F, 10.0F, -1.0F);
		tunicFront.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		setRotateAngle(tunicFront, 0.2617993877991494F, 0.0F, 0.0F);
		shoulderRight = new ModelRenderer(this, 0, 68);
		shoulderRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulderRight.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		setRotateAngle(shoulderRight, 0.0F, 0.0F, 0.08726646259971647F);
		hoodShade = new ModelRenderer(this, 105, 0);
		hoodShade.setRotationPoint(0.0F, -7.3F, -5.2F);
		hoodShade.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 0, 0.0F);
		setRotateAngle(hoodShade, 0.05235987755982988F, 0.0F, 0.0F);
		tunicLeft = new ModelRenderer(this, 23, 65);
		tunicLeft.setRotationPoint(-2.01F, 0.0F, -2.1F);
		tunicLeft.addBox(0.0F, 0.0F, -1.0F, 4, 10, 1, 0.0F);
		setRotateAngle(tunicLeft, 0.12217304763960307F, -1.5707963267948966F, 0.0F);
		tunicRightBack_1 = new ModelRenderer(this, 53, 77);
		tunicRightBack_1.setRotationPoint(-0.01F, 10.0F, -1.0F);
		tunicRightBack_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		setRotateAngle(tunicRightBack_1, 0.2617993877991494F, 0.0F, 0.0F);
		hat1 = new ModelRenderer(this, 49, 111);
		hat1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hat1.addBox(-4.5F, -10.5F, -4.5F, 9, 5, 9, 0.0F);
		tunicRightBack = new ModelRenderer(this, 53, 65);
		tunicRightBack.setRotationPoint(-1.99F, 0.0F, 2.1F);
		tunicRightBack.addBox(0.0F, 0.0F, -1.0F, 4, 10, 1, 0.0F);
		setRotateAngle(tunicRightBack, 0.12217304763960307F, 0.0F, 0.0F);
		hoodFringeR02 = new ModelRenderer(this, 97, 19);
		hoodFringeR02.mirror = true;
		hoodFringeR02.setRotationPoint(-4.85F, -1.2F, 0.1F);
		hoodFringeR02.addBox(-1.0F, -0.5F, -5.38F, 1, 2, 10, 0.0F);
		setRotateAngle(hoodFringeR02, 0.0F, 0.0F, -0.20943951023931953F);
		hoodFringe01 = new ModelRenderer(this, 66, 0);
		hoodFringe01.setRotationPoint(0.0F, 0.0F, 0.1F);
		hoodFringe01.addBox(-3.0F, -8.9F, -5.4F, 6, 2, 1, 0.0F);
		hoodFringeR01 = new ModelRenderer(this, 77, 24);
		hoodFringeR01.mirror = true;
		hoodFringeR01.setRotationPoint(-1.9F, -8.2F, 0.1F);
		hoodFringeR01.addBox(-2.0F, -0.3F, -5.39F, 2, 8, 10, 0.0F);
		setRotateAngle(hoodFringeR01, 0.0F, 0.0F, 0.2792526803190927F);
		legLeft = new ModelRenderer(this, 3, 32);
		legLeft.setRotationPoint(-2.0F, 12.0F, 0.0F);
		legLeft.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, 0.0F);
		tunicRight = new ModelRenderer(this, 23, 65);
		tunicRight.setRotationPoint(2.01F, 0.0F, -2.1F);
		tunicRight.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
		setRotateAngle(tunicRight, -0.12217304763960307F, -1.5707963267948966F, 0.0F);
		hoodPipe02 = new ModelRenderer(this, 65, 54);
		hoodPipe02.setRotationPoint(0.0F, -0.3F, 3.1F);
		hoodPipe02.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F);
		setRotateAngle(hoodPipe02, -0.45378560551852565F, 0.0F, 0.0F);
		hat2 = new ModelRenderer(this, 87, 114);
		hat2.setRotationPoint(0.0F, -10.5F, -3.0F);
		hat2.addBox(-3.0F, -4.0F, 0.0F, 6, 4, 6, 0.0F);
		setRotateAngle(hat2, -0.2617993877991494F, 0.0F, 0.0F);
		hoodFringeL04 = new ModelRenderer(this, 57, 20);
		hoodFringeL04.setRotationPoint(2.7F, -8.4F, 0.1F);
		hoodFringeL04.addBox(-3.2F, -1.0F, -5.38F, 4, 2, 11, 0.0F);
		setRotateAngle(hoodFringeL04, 0.0F, 0.0F, 0.3141592653589793F);
		hood01 = new ModelRenderer(this, 70, 0);
		hood01.setRotationPoint(0.0F, 0.0F, 0.0F);
		hood01.addBox(-4.5F, -9.0F, -4.7F, 9, 9, 10, 0.0F);
		hoodFringeR03 = new ModelRenderer(this, 97, 33);
		hoodFringeR03.mirror = true;
		hoodFringeR03.setRotationPoint(-5.15F, -0.7F, 0.1F);
		hoodFringeR03.addBox(0.0F, -0.9F, -5.37F, 5, 2, 10, 0.0F);
		setRotateAngle(hoodFringeR03, 0.0F, 0.0F, 0.3141592653589793F);
		hoodFringeL02 = new ModelRenderer(this, 97, 19);
		hoodFringeL02.setRotationPoint(4.85F, -1.2F, 0.1F);
		hoodFringeL02.addBox(0.0F, -0.5F, -5.38F, 1, 2, 10, 0.0F);
		setRotateAngle(hoodFringeL02, 0.0F, 0.0F, 0.20943951023931953F);
		tunicLeft_1 = new ModelRenderer(this, 23, 77);
		tunicLeft_1.setRotationPoint(-0.01F, 10.0F, -1.0F);
		tunicLeft_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		setRotateAngle(tunicLeft_1, 0.2617993877991494F, 0.0F, 0.0F);
		tunicLeftFront = new ModelRenderer(this, 53, 65);
		tunicLeftFront.setRotationPoint(2.01F, 0.0F, -2.1F);
		tunicLeftFront.addBox(0.0F, 0.0F, -1.0F, 4, 10, 1, 0.0F);
		setRotateAngle(tunicLeftFront, -3.01941960595019F, 0.0F, 3.141592653589793F);
		armRight = new ModelRenderer(this, 47, 81);
		armRight.mirror = true;
		armRight.setRotationPoint(5.0F, 2.0F, 0.0F);
		armRight.addBox(-1.0F, -1.9F, -2.0F, 4, 12, 4, 0.0F);
		hoodFringeL01 = new ModelRenderer(this, 77, 24);
		hoodFringeL01.setRotationPoint(1.9F, -8.2F, 0.1F);
		hoodFringeL01.addBox(0.0F, -0.3F, -5.39F, 2, 8, 10, 0.0F);
		setRotateAngle(hoodFringeL01, 0.0F, 0.0F, -0.2792526803190927F);
		tunicLeftBack_1 = new ModelRenderer(this, 53, 77);
		tunicLeftBack_1.setRotationPoint(-0.01F, 10.0F, 1.0F);
		tunicLeftBack_1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
		setRotateAngle(tunicLeftBack_1, -0.2617993877991494F, 0.0F, 0.0F);
		hat3 = new ModelRenderer(this, 110, 112);
		hat3.setRotationPoint(1.4F, -4.0F, 1.5F);
		hat3.addBox(-3.0F, -4.0F, 0.0F, 3, 4, 3, 0.0F);
		setRotateAngle(hat3, -0.3490658503988659F, 0.0F, 0.0F);
		legLeft.addChild(tunicLeftBack);
		legRight.addChild(tunicRightFront);
		armLeft.addChild(sleeveLeft);
		tunicRightFront.addChild(tunicRightFront_1);
		armLeft.addChild(shoulderLeft);
		hood01.addChild(hoodFringeL03);
		tunicRight.addChild(tunicRight_1);
		Body.addChild(armLeft);
		armRight.addChild(sleeveRight);
		hood01.addChild(hoodFringeR04);
		hat1.addChild(hatWing);
		hood01.addChild(hoodPipe01);
		tunicLeftFront.addChild(tunicFront);
		armRight.addChild(shoulderRight);
		hood01.addChild(hoodShade);
		legLeft.addChild(tunicLeft);
		tunicRightBack.addChild(tunicRightBack_1);
		legRight.addChild(tunicRightBack);
		hood01.addChild(hoodFringeR02);
		hood01.addChild(hoodFringe01);
		hood01.addChild(hoodFringeR01);
		legRight.addChild(tunicRight);
		hoodPipe01.addChild(hoodPipe02);
		hat1.addChild(hat2);
		hood01.addChild(hoodFringeL04);
		hood01.addChild(hoodFringeR03);
		hood01.addChild(hoodFringeL02);
		tunicLeft.addChild(tunicLeft_1);
		legLeft.addChild(tunicLeftFront);
		Body.addChild(armRight);
		hood01.addChild(hoodFringeL01);
		tunicLeftBack.addChild(tunicLeftBack_1);
		hat2.addChild(hat3);
	}
	
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (hat) hat1.showModel = slot == EntityEquipmentSlot.HEAD;
		else hood01.showModel = slot == EntityEquipmentSlot.HEAD;
		Body.showModel = slot == EntityEquipmentSlot.CHEST;
		armRight.showModel = slot == EntityEquipmentSlot.CHEST;
		armLeft.showModel = slot == EntityEquipmentSlot.CHEST;
		legRight.showModel = slot == EntityEquipmentSlot.LEGS;
		legLeft.showModel = slot == EntityEquipmentSlot.LEGS;
		bipedHeadwear.showModel = false;
		
		bipedHead = hat ? hat1 : hood01;
		bipedBody = Body;
		bipedRightArm = armRight;
		bipedLeftArm = armLeft;
		bipedRightLeg = legRight;
		bipedLeftLeg = legLeft;
		
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}
}