package com.euser.userservice.vo;

import com.euser.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponceTemplatevo {
    private User user;
    private Department department;

}
