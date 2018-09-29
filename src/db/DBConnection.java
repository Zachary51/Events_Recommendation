package db;

import java.util.List;
import java.util.Set;

import entity.Item;

public interface DBConnection {
	/**
	 * Close the connection
	 */
	public void close();
	
	/**
	 * Insert the favorite items for a User
	 */
	public void setFavoriteItems(String userId, List<String> itemIds);
	
	/**
	 * Delete the favorite items for a user
	 */
	public void unsetFavoriteItems(String userId, List<String> itemIds);
	
	/**
	 * Get the favorite item ids for a user
	 */
	public Set<String> getFavoriteItemIds(String userId);
	
	/**
	 * Get the favorite items for a user
	 */
	public Set<Item> getFavoriteItems(String userId);
	
	/**
	 * Get categories based on item id
	 */
	public Set<String> getCategories(String itemId);
	
	/**
	 * Search items near a geolocation and a term
	 */
	public List<Item> searchItems(double lat, double lon, String term);
	
	/**
	 * Save item into db
	 */
	public void saveItem(Item item);
	
	/**
	 * Get full name of a user
	 */
	public String getFullname(String userId);
	
	/**
	 * Credential
	 */
	public boolean verifyLogin(String userId, String password);

	
}
