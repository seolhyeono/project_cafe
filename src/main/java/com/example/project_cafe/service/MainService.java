package com.example.project_cafe.service;

import com.example.project_cafe.dto.*;

import java.util.List;

public interface MainService {
    List<CategoryDTO> getAllCategories();
    List<MenuDTO> getMenusByCategory(Long categoryId);
    MenuDTO getMenuDetail(Long menuId);
    List<MenuOptionDTO> getOptionsForMenu(Long menuId);
    List<CartDTO> getCartItems(String phone);
    void updateCartQuantity(Long cartItemId, Long newQuantity);
    void removeCartItem(Long cartItemId);
    void clearCart(String phone); // 주문 완료 후
//  OrdersDTO placeOrder(OrderRequest request);
    OrdersDTO getOrderDetail(Long orderId);
    CartDTO addToCart(AddCartRequest request);
}
