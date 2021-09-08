package com.sparta.week03_hw.service;

import com.sparta.week03_hw.domain.Memo;
import com.sparta.week03_hw.domain.MemoRepository;
import com.sparta.week03_hw.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional // DB에 자동 업데이트
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.") // 전달받은 값이 잘못되었다는 오류
        );
        memo.update(requestDto);
        return memo.getId();
    }
}