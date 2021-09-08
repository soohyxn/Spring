package com.sparta.week03_hw.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime startDate, LocalDateTime endDate); // 수정시간 기준으로 내림차순 정렬하여 24시간 이내의 모든 데이터 조회
}
