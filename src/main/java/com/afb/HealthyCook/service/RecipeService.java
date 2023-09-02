package com.afb.HealthyCook.service;

import com.afb.HealthyCook.domain.dto.Recipe.CreateRecipeResource;
import com.afb.HealthyCook.domain.dto.Recipe.GetRecipeResource;
import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;
import java.util.List;

public interface RecipeService {
    CreateRecipeResource saveRecipe(CreateRecipeResource resource) throws Exception;

    GetRecipeResource findById(Integer id) throws Exception;

    List<GetRecipeResource> findRecipesByIngredients(List<String> ingredient) throws Exception;
    List<GetRecipeResource> findRecipesByUser(Integer userId) throws Exception;

    List<GetRecipeResource> findRecipesByDifficulty(String difficulty) throws Exception;
    List<GetRecipeResource> getLastFiveRecipes() throws Exception;

    byte[] getRecipePDF(Integer id) throws FileNotFoundException, JRException;

    Integer getNumberOfRecipes() throws Exception;
    List<GetRecipeResource> getRecipes() throws Exception;
}
