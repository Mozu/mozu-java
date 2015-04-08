package com.mozu.test.framework.helper;

import com.mozu.api.contracts.mzdb.EntityList;
import com.mozu.api.contracts.mzdb.IndexedProperty;

public class EntityGenerator {
	public static EntityList generateEntityList(String nameSpace, String name1, String name2)
	{
        EntityList entityList = new EntityList();
        entityList.setContextLevel("tenant");
        entityList.setName("Test" + Generator.randomString(5, Generator.AlphaChars));
        entityList.setNameSpace(nameSpace);
        entityList.setIdProperty(generateIndexedProperty(name1, "date"));
        entityList.setIndexA(generateIndexedProperty(name2, "date"));
        entityList.setIsVisibleInStorefront(false);
        entityList.setIsLocaleSpecific(false);
        entityList.setIsSandboxDataCloningSupported(true);
        entityList.setIsShopperSpecific(false);
		return entityList;
	}
	
	private static IndexedProperty generateIndexedProperty(String name, String type) {
        IndexedProperty property = new IndexedProperty();
        property.setPropertyName(name);
        property.setDataType(type);
            
        return property;
    }
}