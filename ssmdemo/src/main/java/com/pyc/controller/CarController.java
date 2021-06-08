package com.pyc.controller;

import com.pyc.bean.Car;
import com.pyc.service.CarService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
public class CarController {

    @Autowired
    CarService carService;
    @RequestMapping("importCars")
    public String importCars(MultipartFile excel) throws IOException, InvalidFormatException {
        List<Car> cars = new ArrayList<>();

        InputStream is = excel.getInputStream();

        Workbook book = WorkbookFactory.create(is);//虚拟excel对象
        Sheet sheet = book.getSheetAt(0);//获取第一张表对象
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);//获取行对象
            Cell cell1 = row.getCell(0);//获取行单元对象
            Cell cell2 = row.getCell(1);//获取行单元对象
            Cell cell3 = row.getCell(2);//获取行单元对象

            String cname = cell1.toString();
            String color = cell2.toString();
            int price = Integer.parseInt(cell3.toString().replace(".0",""));
            Car car = new Car(null,cname,color,price);
            cars.add(car);
        }

        carService.saves(cars);
        return "success";
    }

}
