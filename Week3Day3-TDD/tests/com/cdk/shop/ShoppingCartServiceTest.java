package com.cdk.shop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jagtapm on 8/2/2017.
 */
public class ShoppingCartServiceTest {

    ShoppingCartService shoppingCartService = null;
    Product product = null;

    @org.junit.Before
    public void init() {
        shoppingCartService = new ShoppingCartService();
        product = new Product(95857556L, "product1", 800.00, 2);
    }

    @After
    public void clean() {
        shoppingCartService = null;
        product = null;
    }

    /**
     * Function testAddItem() tests whether product got added in the cart
     * successfully or not
     */
    @Test
    public void testAddItem() {
        shoppingCartService.addItem(product);
        Assert.assertTrue(shoppingCartService.cart.containsKey(product.getId()));
    }

    /**
     * Function testAddItemQuantity() checks whether quantity of products in the cart
     * gets increased by the same amount after adding more quantity of product
     */
    @Test
    public void testAddItemQuantity() {
        //var i stores quantity of products in cart
        int i = 0;
        if (shoppingCartService.cart.containsKey(product.getId())) {
            i = shoppingCartService.cart.get(product.getId()).getQty();
        }
        shoppingCartService.addItem(product);
        shoppingCartService.addItem(product);
        Assert.assertEquals(4, shoppingCartService.cart.get(product.getId()).getQty());
    }

    /**
     * Function testRemoveItemForException() tests whether RemoveItem()
     * throws ItemNotFoundException if product with given product id
     * is not present in the cart
     *
     * @throws ItemNotFoundException
     */
    @Test(expected = ItemNotFoundException.class)
    public void testRemoveItemForException() throws ItemNotFoundException {
        shoppingCartService.removeItem(product.getId());
    }

    /**
     * Function testRemoveItem() tests whether RemoveItem()
     * removes product with given id from the cart.
     *
     * @throws ItemNotFoundException
     */
    @Test
    public void testRemoveItem() throws ItemNotFoundException {
        shoppingCartService.addItem(product);
        shoppingCartService.removeItem(product.getId());
        Assert.assertFalse(shoppingCartService.cart.containsKey(product.getId()));
    }

    /**
     * Function testCountItemsEmpty() checks whether CountItems()
     * returns 0 for an empty cart
     */
    @Test
    public void testCountItemsEmpty() {
        Assert.assertEquals(0, shoppingCartService.countItems());
    }

    /**
     * Function testCountItems() checks whether CountItems()
     * returns correct count of items.
     */
    @Test
    public void testCountItems() {
        shoppingCartService.addItem(product);
        shoppingCartService.addItem(new Product(747474L, "product2", 7474.44, 1));
        Assert.assertEquals(3, shoppingCartService.countItems());
    }

    /**
     * Function testEmptyCart() tests whether emptyCart()
     * removes all the items in cart
     */
    @Test
    public void testEmptyCart() {
        shoppingCartService.addItem(product);
        shoppingCartService.emptyCart();
        Assert.assertEquals(0L, shoppingCartService.countItems());
    }

    /**
     * Function testTotalPrice() tests whether totalPrice() returns
     * total price for filled cart correctly
     */
    @Test
    public void testTotalPrice() {
        shoppingCartService.addItem(product);
        shoppingCartService.addItem(new Product(747474L, "product2", 700.00, 1));
        Assert.assertEquals(2300.00, shoppingCartService.totalPrice(), 2);

    }

    /**
     * Function testTotalPriceForEmpty() tests whether totalPrice() returns
     * total price for an empty cart correctly
     */
    @Test
    public void testTotalPriceForEmpty() {

        Assert.assertEquals(0.00, shoppingCartService.totalPrice(), 2);

    }


}
