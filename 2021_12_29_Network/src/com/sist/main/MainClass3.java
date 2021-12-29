package com.sist.main;

/*
 *   제어문 4장
 *   ===== 필수 (모아서 관리)
 *
 *   *** 데이터 => 배열
 *   *** 명령문(연산자+제어문) => 메소드
 *   ============================== 클래스
 *
 *   제어문 : 웹 => 목록 출력 (for=for-each), 색상 변경 (조건문)
 *
 *   자바에서 제공하는 제어문 (모든 프로그램언어(자바,C/C++,C#,Python,Kotlin) : 제어문,배열)
 *   ===================
 *      자바 : 웹,모바일
 *      C/C++ : 기계제어 (임베디드)
 *      C# : 응용프로그램/웹,모바일 => exe
 *      Python : AI(데이터 통계,데이터 수집)
 *      Kotlin : 모바일 , 서버
 *      ======= 스프링에서 자바(유료화) => 자바를 대체 ==> 이후 몇년 => 자바
 *   = 조건문
 *      = 단일 조건문 : 에러처리 , 점프 => 소스를 건너뛰는 경우
 *         if(조건문)
 *         {
 *            조건이 true일때 수행하는 문장
 *         }
 *
 *         if(조건문)
 *           조건이 true일때 수행하는 문장
 *           문장 => 별도의 문장 if문과 관련이 없는 문장
 *         *** 모든 제어문은 한문장만 수행이 가능
 *         *** 여러문장을 동시에 수행 => {}
 *
 *        *** 회사 기술면접 => 회사에서 사용하는 소스 ==> 분석 발표
 *        *** 인성면접 : 술,집....
 *      = 선택 조건문 : true/false=> 나눠서 처리
 *        ======> try~catch
 *        if(조건문)
 *        {
 *            조건문이 true일때 처리하는 문장
 *        }
 *        else
 *        {
 *            조건문이 false일대 처리하는 문장
 *        }
 *
 *      = 다중 조건문 : 조건에 맞는 조건문만 수행 => 한개만 수행
 *        if(조건문)
 *        {
 *           조건문이 true일때 수행 ==> 종료
 *           조건문이 false일때 바로 아래 있는 조건문을 찾아 간다
 *                  ↓
 *        }
 *        else if(조건문)
 *        {
 *           조건문이 true일때 수행 ==> 종료
 *           조건문이 false일때 바로 아래 있는 조건문을 찾아 간다
 *                  ↓
 *        }
 *        else if(조건문)
 *        {
 *           조건문이 true일때 수행 ==> 종료
 *           조건문이 false일때 바로 아래 있는 조건문을 찾아 간다
 *                  ↓
 *        }
 *        else
 *        {
 *            조건이 true인 내용이 없는 경우에 수행 (생략이 가능)
 *        }
 *   = 반복문
 *       for : 반복 횟수가 있는 경우 => 일반 개발자
 *       ==> 기본적으로 2차 for
 *       형식)
 *                  1  →  2  ←  4
 *            for(초기값;조건식;증가식) => 무한루프 for(;;)
 *            {               ↗
 *                       ↓
 *               반복 실행 문장 3
 *            }
 *
 *            for(초기값;조건식;증가식) => 줄수 (row)
 *            {
 *               for(초기값;조건식;증가식) => col(출력)
 *               {
 *                   출력할 내용이 들어간다
 *               }
 *            }
 *            ==> 자료구조 , 알고리즘 (코테) : 정렬 , 순위....
 *                Stack,Queue
 *       for-each : 출력용으로 사용 (웹)
 *            제어나 값을 변경 할 수 없고 => 데이터 출력
 *            for(받는 변수 : 배열,컬렉션)
 *            {
 *
 *            }
 *            ArrayList<Music> mList;
 *            for(Music m:mList) => mList에 저장된 갯수만큼 수행
 *            {
 *            }
 *            int[] arr={}
 *            for(int i:arr)
 *            {
 *            }
 *
 *            웹 => 마지막 변경
 *            <c:forEach var="i" begin="1" end="10" step="1">
 *              => for(int i=1;i<=10;i++)
 *            <c:forEach var="vo" items="list">
 *       while : 반복 횟수가 없는 경우 => 오라클 연결 데이터 읽기
 *                                   파일 줄수
 *                                   서버 => 무한루프
 *       형식)
 *            초기값  ========= 1
 *            while(조건식) === 2  => while(true) => 종료조건
 *            {
 *               반복수행문장 === 3
 *               증가식    ==== 4
 *            }
 *
 *   = 반복제어문
 *      break => 반복문을 중단시에 사용 => 반복문 , 선택문에서만 사용이 가능
 *      if => return => 메소드 종료
 *
 */
public class MainClass3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
