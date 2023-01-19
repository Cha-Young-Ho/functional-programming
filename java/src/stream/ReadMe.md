# Reduce

Reduce는 stream의 모든 값을 하나의 로직으로 통합시켜주는 메소드입니다.

# Precaution

병렬 스트림을 생성하여 외부에 존재하는 값을 접근해야할 경우에 원자성을 보장받지 않습니다.

외부의 값에 접근을 하는 것을 최대한 피하거나, 외부의 값을 atomic 하게 유지하여야 합니다.

또는

계산되는 순서 상관없이 동일한 결과 값이 나오도록 하는 로직으로 구성하여야 합니다.