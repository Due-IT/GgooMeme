package com.wap.GgoememeBackend.payload;

import com.wap.GgoememeBackend.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostPreviewDto {
    private Long postId;
    private String image;

    public static PostPreviewDto of(Post post){

        return new PostPreviewDto(post.getId(),
                post.getImage());
    }
}
