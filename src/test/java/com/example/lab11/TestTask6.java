//package com.example.lab11;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import com.example.lab11.other.Task6;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//@WebMvcTest(Task6.class)
//public class TestTask6 {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testStudentInfo() throws Exception {
//        mockMvc.perform(get("/student-info"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("Ali"))
//                .andExpect(jsonPath("$.age").value(21))
//                .andExpect(jsonPath("$.status").value("active"));
//    }
//
//    @Test
//    public void testCourseInfo() throws Exception {
//        mockMvc.perform(get("/course-info"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.title").value("Java Programming"))
//                .andExpect(jsonPath("$.description").value("Learn Java from basics to advanced."))
//                .andExpect(jsonPath("$.duration").value("6 months"));
//    }
//
//    @Test
//    public void testUserProfile() throws Exception {
//        mockMvc.perform(get("/user-profile"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("Roxanne"))
//                .andExpect(jsonPath("$.email").value("roxanne@example.com"))
//                .andExpect(jsonPath("$.role").value("Student"));
//    }
//
//    @Test
//    public void testProductDetails() throws Exception {
//        mockMvc.perform(get("/product-details"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("Apple")) // Change expected value to "Apple"
//                .andExpect(jsonPath("$.category").value("technology"))
//                .andExpect(jsonPath("$.price").value(499.99))
//                .andExpect(jsonPath("$.stock").value("active"));
//    }
//
//    @Test
//    public void testOrderSummary() throws Exception {
//        mockMvc.perform(get("/order-summary"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.orderID").value(12345))
//                .andExpect(jsonPath("$.customerName").value("John Doe"))
//                .andExpect(jsonPath("$.totalCost").value(1200.99))
//                .andExpect(jsonPath("$.items[0].name").value("Laptop"))
//                .andExpect(jsonPath("$.items[0].quantity").value(1))
//                .andExpect(jsonPath("$.items[0].price").value(1200.99));
//    }
//}
//
