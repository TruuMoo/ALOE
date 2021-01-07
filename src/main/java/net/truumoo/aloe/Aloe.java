package net.truumoo.aloe;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prug.prugutils.main.ConfigurableDrinkableEffectType;


public class Aloe implements ModInitializer {

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier("aloe", "aloe"))
			.icon(() -> new ItemStack(Aloe.LITHIUM_CARBONATE))
			.build();


	public static final Block LITHIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(20.0f));
	public static final Item LITHIUM_INGOT = new Item(new FabricItemSettings().group(Aloe.ITEM_GROUP));

	public static final LithiumCarbonate LITHIUM_CARBONATE = new LithiumCarbonate(new FabricItemSettings(), StatusEffect.byRawId(19), 300, 1, null);

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("aloe", "lithium_block"), LITHIUM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("aloe", "lithium_block"), new BlockItem(LITHIUM_BLOCK, new Item.Settings().group(Aloe.ITEM_GROUP)));
		Registry.register(Registry.ITEM, new Identifier("aloe", "lithium_carbonate"), LITHIUM_CARBONATE);
		Registry.register(Registry.ITEM, new Identifier("aloe", "lithium_ingot"), LITHIUM_INGOT);
	}


}

