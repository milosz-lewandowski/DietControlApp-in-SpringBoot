package pl.dietapp.demo.services;

import pl.dietapp.demo.entity.Category;

import java.util.List;

public interface CategoriesService {
    public List<Category> getCategories();
    public void saveCategory(Category category);
    public void deleteCategory(Category category);
    public void editCategoryName(Category category);
}
