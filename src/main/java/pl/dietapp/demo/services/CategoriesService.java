package pl.dietapp.demo.services;

import pl.dietapp.demo.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoriesService {
    public List<Category> getCategories();
    public Optional<Category> getCategoryById(int id);
    public void saveCategory(Category category);
    public void deleteCategory(Category category);
    public void editCategoryName(Category category);
}
