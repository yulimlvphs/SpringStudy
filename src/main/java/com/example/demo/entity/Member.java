package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/* Member 테이블 엔티티 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private Integer id;
    private String name;
}
