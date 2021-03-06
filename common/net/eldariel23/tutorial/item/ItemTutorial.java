package net.eldariel23.tutorial.item;

import net.eldariel23.tutorial.Tutorial;
import net.eldariel23.tutorial.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorial extends Item {
	
	public ItemTutorial() {
	setRegistryName(new ResourceLocation(Tutorial.MOD_ID, Names.TUTORIAL_ITEM));
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		
		if(!world.isRemote)
			player.sendMessage(new TextComponentString("You used my item!!!"));
		
		return super.onItemRightClick(world, player, hand);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return "item." + Tutorial.RESOURCE_PREFIX + Names.TUTORIAL_ITEM; //item.tutorial:tutorial_item
	}
}
