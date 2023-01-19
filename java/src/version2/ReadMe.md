# Version 2️⃣

Version 1과는 다르게 특별한 옵션 값인 "SearchOption"을 파라미터로 전달받아 로직을 분기하였습니다.

# Focus

"SearchOption"이라는 열거타입을 따로 선언하여 구성하였습니다.

그래서 1개의 함수로 모든 내용을 대응할 수 있게 되었습니다.

# Precautions

요구사항이 계속해서 추가될 떄마다, "SearchOption"의 property가 계속해서 추가됩니다.

그리고 함수 내부에 분기처리가 계속해서 추가됩니다.

Version3 에서 해당 사항을 좀 더 간편하게 수정해보겠습니다.


