# 캠퍼스 내 분실물 관리 시스템
term project for SW training <br />
- Project execution period : 2019.01.25~2019.01.31 <br/>
- email address : lamlyg@naver.com <br />

## Introduction
[주제] 캠퍼스 내 분실물에 대한 관리 시스템을 Java Web 및 DB를 이용한 팀프로젝트 진행 <br/>
- 습득한 물건을 보여주는 ‘찾아가세요’와 분실한 물건을 보여주는 ‘찾아주세요’ 두 개의 섹션으로 구성
- 둘 중 하나의 섹션으로 들어가면 DB에 등록되어 있는 분실 혹은 습득 물건 정보를 담고있는 테이블 출력
- 글쓰기를 통해 물건 정보를 DB에 등록
- 키워드 검색 기능 탑재

## Development Environment
### OS 
- Windows 10
### Client
- Java
- SQL Developer
### Data Server
- Oracel.11.se (MyBatis)

## Detail Information
### Project Purpose
1. SW연수를 이수하면서 배운 것을 최대로 활용할 수 있는지 확인 
2. 간단하면서도 실생활에서 실질적으로 사용할 수 있는 프로그램을 구현하고자 한다.
### Design
1. MainView : 찾아가세요 찾아주세요 버튼 생성
2. FindForm : search 및 Jtable 생성
3. FindView : 더보기 버튼 클릭 시 고유번호 matching 및 DB에서 해당 정보 추출
4. LostForm : search 및 Jtable 생성
5. LostView : 더보기 버튼 클릭 시 고유번호 matching 및 DB에서 해당 정보 추출
6. WriteForm_find : 습득자의 습득 물품 정보 작성
7. WriteForm_lost : 분실자의 분실 물품 정보 작성


## Database (ERD)
![image](https://user-images.githubusercontent.com/33417495/87373685-18970100-c5c5-11ea-8bfa-f7ccc97cb959.png)

## screenshot
- MainView : 찾아가세요 찾아주세요 버튼 생성

<br />

![image](https://user-images.githubusercontent.com/33417495/87376300-8e4f9c80-c5c6-11ea-97b0-0dd02f2e936f.png)

<br />

- FindForm : search 및 Jtable 생성

<br />

![image](https://user-images.githubusercontent.com/33417495/87376489-a0313f80-c5c6-11ea-8c46-1f68a8782267.png)

<br />

- FindView : 더보기 버튼 클릭 시 고유번호 matching 및 DB에서 해당 정보 추출

<br />

![image](https://user-images.githubusercontent.com/33417495/87376613-acb59800-c5c6-11ea-9815-87d919f67b4c.png)

<br />

- LostForm : search 및 Jtable 생성

<br />

![image](https://user-images.githubusercontent.com/33417495/87376924-cce55700-c5c6-11ea-8724-9dbc7b62bb78.png)

<br />

- LostView : 더보기 버튼 클릭 시 고유번호 matching 및 DB에서 해당 정보 추출

<br />

![image](https://user-images.githubusercontent.com/33417495/87377065-dbcc0980-c5c6-11ea-8fd2-e82472670581.png)

<br />

- WriteForm_find : 습득자의 습득 물품 정보 작성

<br />

![image](https://user-images.githubusercontent.com/33417495/87376812-bf2fd180-c5c6-11ea-8d1c-65621420980b.png)

<br />

- WriteForm_lost : 분실자의 분실 물품 정보 작성

<br />

![image](https://user-images.githubusercontent.com/33417495/87377202-e8506200-c5c6-11ea-90a0-b8e124611031.png)

<br />

## Final Presentation PPT
[Presentation](https://github.com/lamlyg/Mulcam-TeamProject/blob/master/Project_Report.pdf)
