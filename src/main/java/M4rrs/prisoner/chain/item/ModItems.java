package M4rrs.prisoner.chain.item;

import M4rrs.prisoner.chain.PrisonerChain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	
	public static final Item PRISONER_CHAIN = registerItem("prisoner_chain", 
		new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(PrisonerChain.MOD_ID, name), item);
	}

	public static void addItemsToItemGroup() {

		addToItemGroup(ItemGroups.TOOLS, PRISONER_CHAIN);
	}
	
	private static void addToItemGroup(ItemGroup group, Item item) {
	
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	public static void registerModItems() {
		PrisonerChain.LOGGER.info("Registering Mod Item " + PrisonerChain.MOD_ID);
	}
}
