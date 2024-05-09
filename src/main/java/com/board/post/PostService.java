package com.board.post;

import com.board.user.User;
import com.board.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    // 여기서부터 메서드 작성 ??
    // 해야 하는데 못 했습니다 ..

    public Long save(String title, String content, String userId) {
        // 유저 레포지토리에서 유저 찾고 ?
        // 포스트 찾고 ?
        // 리턴

        return null;
    }

    public void updatePost(Long userId, String title, String content) {
        // 유저 찾고
        // 포스트를 유저로 찾고
        // 업뎃하고

        // 아 여기서 포스트를 유저로 찾으려면 findById 구현을 ..
        Post post = postRepository.findById(userId);
    }

    public void delete(Long userId, Long postId) {
        User user = userRepository.findById(userId);
        Post post = postRepository.findById(postId);

        postRepository.deletePost(post);
    }

    public List<PostResponse> getPosts() {
        List<Post> postList = postRepository.findAllPost();
        return postList.stream()
                .map(post -> )
    }

    public PostResponse getPostById(Long postId) {
        Post post = postRepository.findById(postId);

        return new PostResponse(post.getPostId(), post.getTitle(), post.getContent(),
                post.getMemberId(), post.getCreatedDate());
    }
}
