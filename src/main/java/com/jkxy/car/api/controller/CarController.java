package com.jkxy.car.api.controller;

import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.service.CarService;
import com.jkxy.car.api.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarService carService;

    /**
     * 通过车名模糊查询,并且带分页功能
     *
     * @param carName
     * @return
     */
    @GetMapping("findByFuzzyCarName/{carName}/{start}/{end}")
    public JSONResult findByFuzzyCarName(@PathVariable String carName, @PathVariable int start,@PathVariable int end) {
        List<Car> cars = carService.findByFuzzyCarName(carName,start, end);
        return JSONResult.ok(cars);
    }

    /**
     * 通过车名模糊查询
     *
     * @param carName
     * @return
     */
    @GetMapping("findByFuzzyCarName/{carName}")
    public JSONResult findByFuzzyCarName(@PathVariable String carName) {
        List<Car> cars = carService.findByFuzzyCarName(carName,0, 10000);
        return JSONResult.ok(cars);
    }

    /**
     * 买车
     *
     * @return
     */
    @GetMapping("buyById/{id}/{amount}")
    public JSONResult buyById(@PathVariable int id, @PathVariable int amount) {
        carService.buyById(id, amount);
        return JSONResult.ok();
    }

    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping("findAll")
    public JSONResult findAll() {
        List<Car> cars = carService.findAll();
        return JSONResult.ok(cars);
    }

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    @GetMapping("findById/{id}")
    public JSONResult findById(@PathVariable int id) {
        Car car = carService.findById(id);
        return JSONResult.ok(car);
    }

    /**
     * 通过车名查询
     *
     * @param carName
     * @return
     */
    @GetMapping("findByCarName/{carName}")
    public JSONResult findByCarName(@PathVariable String carName) {
        List<Car> cars = carService.findByCarName(carName);
        return JSONResult.ok(cars);
    }


    /**
     * 通过id删除
     *
     * @param id
     * @return
     */
    @GetMapping("deleteById/{id}")
    public JSONResult deleteById(@PathVariable int id) {
        carService.deleteById(id);
        return JSONResult.ok();
    }

    /**
     * 通过id更新全部信息
     *
     * @return
     */
    @PostMapping("updateById")
    public JSONResult updateById(Car car) {
        carService.updateById(car);
        return JSONResult.ok();
    }

    /**
     * 通过id增加
     *
     * @param car
     * @return
     */
    @PostMapping("insertCar")
    public JSONResult insertCar(Car car) {
        carService.insertCar(car);
        return JSONResult.ok();
    }
}
