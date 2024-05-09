package com.board.post;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PostRepository {

    private final Map<Long, Post> posts = new HashMap<>();
    private Long id = 1L;

    public Post savePost(Post post) {
        post.setId(id);
        posts.put(id++, post);

        return post;
    }

    public void deletePost(Post post) {
        posts.remove(post.getPostId());
    }

    public Optional<Post> findById(Long postId) {
        return Optional.ofNullable(posts.get(postId));
    }

    public List<Post> findAllPost() {
        return posts.values()
                .stream()
                .collect(Collectors.toList());
    }
}
