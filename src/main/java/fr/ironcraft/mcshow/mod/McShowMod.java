package fr.ironcraft.mcshow.mod;

import org.apache.logging.log4j.Logger;

import fr.ironcraft.mcshow.ShowsManager;
import fr.ironcraft.mcshow.table.BlockShowTable;
import fr.ironcraft.mcshow.table.TileEntityShowTable;
import fr.ironcraft.mcshow.table.TileEntityShowTableRenderer;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = McShowMod.MODID)
public class McShowMod
{
    public static final String MODID = "mcshow";

    @Instance(MODID)
    public static McShowMod instance;
    public static Logger logger;
    
    @SidedProxy(clientSide = "fr.ironcraft.mcshow.mod.McShowClient", serverSide = "fr.ironcraft.mcshow.mod.McShowServer")
    public static McShowCommon proxy;
    
    public static Block showTable;
    public static ShowsManager showsManager;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        
        showsManager = new ShowsManager();
        MinecraftForge.EVENT_BUS.register(showsManager);
        
        showTable = new BlockShowTable().setUnlocalizedName("show_table").setRegistryName("show_table").setCreativeTab(CreativeTabs.MISC);
        
        GameRegistry.register(showTable);
        GameRegistry.register(new ItemBlock(showTable).setRegistryName("show_table").setCreativeTab(CreativeTabs.MISC));
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityShowTable.class, new TileEntityShowTableRenderer());
        GameRegistry.registerTileEntity(TileEntityShowTable.class, "tileEntityShowTable");
    }
    
    
}
