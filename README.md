# Climbing Failure Analyzer

클라이밍 실패 영상을 분석해 실패 원인을 기록/조회하는 프로젝트입니다.

## 구조

- `backend`: Spring Boot(Java 17) 백엔드
  - `src/main/java/com/climbinsight/common`: 전역 에러 핸들링 등 공통 모듈
  - `src/main/java/com/climbinsight/domain`: 도메인 기반 구조
    - `attempt`: 시도 기록 API
    - `analysis`: 실패 원인 분석 서비스
- `frontend/climbing_failure_app`: Flutter 앱
  - `lib/core`: 공통 상수/유틸
  - `lib/features`: 기능 단위 화면

## 백엔드 실행

```bash
cd backend
./gradlew bootRun
```

## 프론트엔드 실행

```bash
cd frontend/climbing_failure_app
flutter pub get
flutter run
```
