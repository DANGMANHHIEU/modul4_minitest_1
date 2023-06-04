package com.example.minitest1.controller;

import com.example.minitest1.model.Book;
import com.example.minitest1.service.BookService;
import com.example.minitest1.service.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/book", produces = "text/html;charset=UTF-8")
public class bookController {
    private final IBookService bookService = new BookService();

    @GetMapping("")
    public String home(ModelMap modelMap) {
        List<Book> bookList = bookService.finAll();
        modelMap.addAttribute("bookList",bookList);
        return "/home";
    }

    @GetMapping("/create")
    public String create(ModelMap mode){
   mode.addAttribute("book",new Book());
   return "/create";
    }
    @PostMapping("/save")
    public String save(Book books, RedirectAttributes redirectAttributes){
       bookService.save(books);
       redirectAttributes.addFlashAttribute("success","Thêm mới thành công");
       return "redirect:/book";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id,ModelMap modelMap){
    modelMap.addAttribute("book",bookService.finById(id));
    return "/edit";
    }
    @PostMapping("/update")
    public String update(@RequestParam int id,Book books,RedirectAttributes redirectAttributes){
      bookService.update(id,books);
      redirectAttributes.addFlashAttribute("success","Sửa thành công");
      return "redirect:/book";
    }

     @GetMapping("/{id}/view")
    public String view(@PathVariable int id,ModelMap mode){
        mode.addAttribute("book",bookService.finById(id));
        return "/view";
     }

     @GetMapping("/{id}/delete")
     public String delete(@PathVariable int id,ModelMap mode){
        mode.addAttribute("book",bookService.finById(id));
        return "/delete";
     }
     @PostMapping("/delete")
    public String delete(Book books,RedirectAttributes redirectAttributes){
        bookService.delete(books.getId());
        redirectAttributes.addFlashAttribute("success","Xóa thành công");
        return "redirect:/book";
     }
}
