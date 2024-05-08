package com.board.memo;

public record MemoCreateRequest(String content,
                                Long userId, String title) {

}
