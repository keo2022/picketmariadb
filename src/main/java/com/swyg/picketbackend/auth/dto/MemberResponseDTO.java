package com.swyg.picketbackend.auth.dto;


import com.swyg.picketbackend.auth.domain.Member;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberResponseDTO {

    private String email;

    private String password; // 비밀번호

    private String nickname; // 닉네임

    private String imageUrl; // 프로필 이미지

    private Role role;

    private SocialType socialType;


    // entity -> dto
    @Builder
    public static MemberResponseDTO of(Member member) {
        return MemberResponseDTO.builder()
                .email(member.getEmail())
                .role(member.getRole())
                .nickname(member.getNickname())
                .imageUrl(member.getImageUrl())
                .build();

    }
}
