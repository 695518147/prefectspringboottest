package com.zpy.validtest.bean;

import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
public class Student {

    @NotNull(message = "用户主键不能为null！")
    private String userId;

    @NotBlank(message = "用户名不能为空")
    private String userName;

    private String password;

    @NotNull(message = "年龄不能为null！")
    @Max(value = 100, message = "年龄不能大于100岁")
    @Min(value= 18 ,message= "必须年满18岁！" )
    private Integer age;

    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$",message = "不满足邮箱正则表达式")
    private String email;

    @NotNull(message = "备注不能为null")
    @Size(max=10,min=5,message = "字段长度要在5-10之间")
    private String remark;

    @DecimalMax(value = "12.00",message = "评分不能小于12.00")
    private BigDecimal socre;

    private Boolean status;

}
