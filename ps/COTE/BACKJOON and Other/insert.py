from faker import Faker
import hashlib

fake = Faker()

print("INSERT INTO `user` (nickname, email, password, points, wins, losses, imageUrl, originFileName) VALUES")

user_data = []
for _ in range(1000):  # 1000명의 사용자 데이터 생성
    nickname = fake.user_name()
    email = fake.email()
    password = hashlib.md5(fake.password().encode()).hexdigest()  # 예제용 해싱
    points = 100
    wins = 0
    losses = 0
    imageUrl = fake.image_url()
    originFileName = f"{nickname}_profile.jpg"

    user_data.append(f"('{nickname}', '{email}', '{password}', {points}, {wins}, {losses}, '{imageUrl}', '{originFileName}')")

# SQL 쿼리로 출력
print(",\n".join(user_data) + ";")
