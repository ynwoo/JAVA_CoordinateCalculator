# 좌표계산기
좌표계산기 기능 구현입니다.

| 날짜         | 내용       |
|------------|----------|
| 2024-06-06 | 초기 구현    |
| 2024-06-09 | 검증 로직 추가 |

### TO-DO
1. 화면에 좌표 점 찍기
2. 사다리꼴이나 마름모는 제외하고 직사각형만 허용


## 요구사항
### 사각형
- [x] 좌표값을 두 개 입력한 경우, 두 점을 잇는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- [x] 좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정한다.
    - [ ] 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.
    - [x] 사각형인 경우 사각형의 넓이를 계산해서 출력한다.

### 선
- [x] 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
- [x] 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
- [x] X, Y좌표 모두 최대 24까지만 입력할 수 있다.
- [x] 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
- [ ] 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
- [x] 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- [x] 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.

### 삼각형
- [x] 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- [x] 좌표값을 세 개 입력한 경우, 세 점을 연결하는 삼각형으로 가정한다.
    - [x] 삼각형인 경우 삼각형의 넓이를 계산해서 출력한다.

