package com.jagadeesh.views;

import com.jagadeesh.models.Category;
import com.jagadeesh.utils.StringUtil;

import java.util.ArrayList;

import static com.jagadeesh.utils.AppOutput.println;

public class AdminCategoryPage {


    public void categoryChoices() {
        println(StringUtil.CATEGORY_CHOICES);
    }

    public void printCategories(ArrayList<Category> categories) {
        println(StringUtil.CATEGORY_MESSAGE);
        for(Category data: categories)
        {
            println(data.getId()+". " + data.getCategoryName());
        }
    }
}
