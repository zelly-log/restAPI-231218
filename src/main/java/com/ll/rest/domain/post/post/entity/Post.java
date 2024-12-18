package com.ll.rest.domain.post.post.entity;

import com.ll.rest.global.jpa.entity.BaseTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder // 빌더를 쓰려면 아래 두 개도 같이 있어야 함
@NoArgsConstructor
@AllArgsConstructor
public class Post extends BaseTime { //BaseTime을 상속받으면 id, 날짜 필드 상속받음
    @Column(length = 100) // 길이 지정
    private String title;

    @Column(columnDefinition = "TEXT") // 타입 지정
    private String content;
}