package me.bananab0i.amazingalloys.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EnderiteBootsItem extends ArmorItem {
    public EnderiteBootsItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    @Override
    public TypedActionResult<ItemStack> use (World world, PlayerEntity user, Hand hand) {
        world.addParticle(ParticleTypes.PORTAL,user.getX(), user.getY(), user.getZ(), user.getVelocity().x, user.getVelocity().y, user.getVelocity().z);
        return super.use(world, user, hand);
    }
}
