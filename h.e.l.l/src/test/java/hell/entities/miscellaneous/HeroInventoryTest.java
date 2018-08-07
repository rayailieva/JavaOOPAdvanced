package hell.entities.miscellaneous;

import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class HeroInventoryTest {
    private HeroInventory heroInventory;
    private Item item;
    private Recipe recipe;
    private Item item1;
    private Recipe recipe1;
    private Item item2;
    private Recipe recipe2;

    @Before
    public void setUp(){
        this.heroInventory = new HeroInventory();
        this.item = Mockito.mock(Item.class);
        this.recipe = Mockito.mock(Recipe.class);
        this.item1 = Mockito.mock(Item.class);
        this.recipe1 = Mockito.mock(Recipe.class);
        this.item2 = Mockito.mock(Item.class);
        this.recipe2 = Mockito.mock(Recipe.class);

        Mockito.when(recipe.getAgilityBonus()).thenReturn(25);

        Mockito.when(item.getStrengthBonus()).thenReturn(10);
        Mockito.when(item1.getStrengthBonus()).thenReturn(10);
        Mockito.when(item2.getStrengthBonus()).thenReturn(10);

        Mockito.when(item.getAgilityBonus()).thenReturn(20);
        Mockito.when(item1.getAgilityBonus()).thenReturn(20);
        Mockito.when(item2.getAgilityBonus()).thenReturn(20);

        Mockito.when(item.getIntelligenceBonus()).thenReturn(10);
        Mockito.when(item1.getIntelligenceBonus()).thenReturn(10);
        Mockito.when(item2.getIntelligenceBonus()).thenReturn(10);

        Mockito.when(item.getHitPointsBonus()).thenReturn(10);
        Mockito.when(item1.getHitPointsBonus()).thenReturn(10);
        Mockito.when(item2.getHitPointsBonus()).thenReturn(10);

        Mockito.when(item.getDamageBonus()).thenReturn(10);
        Mockito.when(item1.getDamageBonus()).thenReturn(10);
        Mockito.when(item2.getDamageBonus()).thenReturn(10);
    }

    @Test
    public void getTotalStrengthBonus() {
        this.heroInventory.addCommonItem(item);
        this.heroInventory.addCommonItem(item1);
        this.heroInventory.addCommonItem(item2);

        Long actual = this.heroInventory.getTotalStrengthBonus();
        Long expected = 10L;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalAgilityBonus(){
        this.heroInventory.addCommonItem(item);
        this.heroInventory.addCommonItem(item1);
        this.heroInventory.addCommonItem(item2);

        Long actual = this.heroInventory.getTotalAgilityBonus();
        Long expected = 20L;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalIntelligenceBonus(){
        this.heroInventory.addCommonItem(item);
        this.heroInventory.addCommonItem(item1);
        this.heroInventory.addCommonItem(item2);

        Long actual = this.heroInventory.getTotalIntelligenceBonus();
        Long expected = 10L;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalHitPointsBonus(){
        this.heroInventory.addCommonItem(item);
        this.heroInventory.addCommonItem(item1);
        this.heroInventory.addCommonItem(item2);

        Long actual = this.heroInventory.getTotalHitPointsBonus();
        Long expected = 10L;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalDamageBonus(){
        this.heroInventory.addCommonItem(item);
        this.heroInventory.addCommonItem(item1);
        this.heroInventory.addCommonItem(item2);

        Long actual = this.heroInventory.getTotalDamageBonus();
        Long expected = 10L;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCommonItem(){
        this.heroInventory.addCommonItem(item);
        this.heroInventory.addCommonItem(item1);
        this.heroInventory.addCommonItem(item2);

        Long actual = this.heroInventory.getTotalHitPointsBonus();
        Long expected = 10L;

        Assert.assertEquals(expected, actual);
    }


}
