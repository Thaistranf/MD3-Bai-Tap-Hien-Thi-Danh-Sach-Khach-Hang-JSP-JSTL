package com.example.baitaphienthidanhsachkhachhangjspjstl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("customer.jsp");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "https://assets.mycast.io/characters/kamen-rider-decade-2818306-normal.jpg?1624406943"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://i.pinimg.com/originals/b9/ea/16/b9ea169c8b6be32149326a383a082c9a.png"));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "https://i.pinimg.com/originals/81/03/ab/8103abeb1c58299ab85528bb0cfd7560.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmMy4_bLtirJr388Et1AxXvIyCSD5OuRvyjQ&usqp=CAU"));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://www.1999.co.jp/itbig61/10615224.jpg"));

        request.setAttribute("l", customerList);
        requestDispatcher.forward(request, response);
    }
}