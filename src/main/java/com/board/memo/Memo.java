package com.board.memo;

import com.board.member.Member;
import java.io.*;
import java.util.*;

import java.time.LocalDate;
import java.time.LocalDate;
import lombok.Getter;


@Getter
public class Memo {
    private Long id;
    private String content;
    private String title;
    private Long userId;

    public Memo(String content, String text, Long userId) {
        this.content = content;
        this.title = title;
        this.userId = userId;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void update(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public void validateMember(Member member) {
        if (!this.userId.equals(member.getId())) {
            throw new ForbiddenException("해당 투두에 대한 권한이 없습니다.");
        }
    }


}
