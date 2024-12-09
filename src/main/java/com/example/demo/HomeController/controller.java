package com.example.demo.HomeController;

import com.example.demo.entity.Phone;
import com.example.demo.entity.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {


        // Список телефонов вынесен как поле класса (глобальная переменная)
        private final List<Phone> phones = new ArrayList<>();

        public controller() {
            // Инициализация списка телефонов
            phones.add(new Phone(1L, "Iphone 15", "256gb", 1000.0));
            phones.add(new Phone(2L, "Samsung Galaxy S23", "128gb", 900.0));
        }

        @GetMapping("/")
        public String index(Model model) {
            model.addAttribute("telephony", phones); // Передаем список телефонов в модель
            return "index";
        }

        @PostMapping("/addPhon")
        public String addPhon(@RequestParam String name, @RequestParam String description, @RequestParam Double price) {
            phones.add(new Phone((long) (phones.size() + 1), name, description, price)); // Добавляем новый телефон в список
            return "redirect:/"; // Перенаправляем на главную страницу
        }
    }
