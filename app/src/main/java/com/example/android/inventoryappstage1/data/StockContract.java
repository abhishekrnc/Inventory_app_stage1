package com.example.android.inventoryappstage1.data;

import android.provider.BaseColumns;


public final class StockContract {
    private StockContract(){}
    public static abstract class ItemEntry implements BaseColumns{

        public static final String TABLE_NAME = "items";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_ITEM_NAME = "name";
        public static final String COLUMN_ITEM_PRICE = "price";
        public static final String COLUMN_ITEM_QUANTITY = "quantity";
        public static final String COLUMN_ITEM_SUPPLIER_NAME = "supplierName";
        public static final String COLUMN_ITEM_SUPPLIER_PHONE_NUMBER = "supplierPhoneNumber";
    }
}
