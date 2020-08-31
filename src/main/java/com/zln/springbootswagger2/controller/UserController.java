package com.zln.springbootswagger2.controller;

import com.zln.springbootswagger2.model.RespBean;
import com.zln.springbootswagger2.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Api(tags = "用户管理相关接口")  //@Api注解可以用来标记当前Controller的功能。
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    @ApiOperation("添加用户的接口") //@ApiOperation注解用来标记一个方法的作用。
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
    //@ApiImplicitParams注解用来描述一个参数，可以配置参数的中文含义，也可以给参数设置默认值，这样在接口测试的时候可以避免手动输入。
    //@ApiImplicitParam注解中虽然可以指定参数是必填的，但是却不能代替@RequestParam(required = true)，前者的必填只是在Swagger2框架内必填，抛弃了Swagger2，这个限制就没用了，所以假如开发者需要指定一个参数必填，@RequestParam(required = true)注解还是不能省略。
    //如果参数是一个对象（例如上文的更新接口），对于参数的描述也可以放在实体类中
    public RespBean addUser(String username, @RequestParam(required = true) String address) {

        return new RespBean(200,new ArrayList<String>());
    }

    @GetMapping("/")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public User getUserById(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        return user;
    }
    @PutMapping("/{id}")
    @ApiOperation("根据id更新用户的接口")
    public User updateUserById(@RequestBody User user) {
        return user;
    }
}
