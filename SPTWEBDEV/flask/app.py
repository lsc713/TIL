from collections import Counter
import requests
import random
from flask import Flask, render_template, request
app = Flask(__name__)


@app.route('/')
def home():
    name = 'lee'
    lotto = [16, 28, 43, 32, 11, 38]

    def generate_lotto_numbers():
        # 1부터 45까지의 숫자 중에서 6개를 선택하여 리스트로 반환합니다.
        lotto_numbers = random.sample(range(1, 46), 6)
        return sorted(lotto_numbers)

    # 로또 번호 생성
    random_lotto = generate_lotto_numbers()

    def count_matching_elements(list1, list2):
        # 리스트의 각 요소를 카운트하여 Counter 객체 생성
        counter1 = Counter(list1)
        counter2 = Counter(list2)

        # 두 Counter 객체의 교집합을 구하고 각 요소의 개수를 더함
        matching_elements = counter1 & counter2
        total_matching_count = sum(matching_elements.values())

        return total_matching_count

    # 두 리스트를 정의하고 함수에 넣어 같은 요소의 개수를 확인
    list_a = [1, 2, 2, 3, 4, 5]
    list_b = [2, 3, 3, 4, 4, 5]
    common_count = count_matching_elements(lotto, random_lotto)

    context = {
        "name": name,
        "lotto": lotto,
        "random_lotto": random_lotto,
        "common_count": common_count
    }
    return render_template('index.html', data=context)


@app.route('/mypage')
def mypage():
    return 'This is page!'


@app.route('/movie')
def movie():
    if (request.args.get('query')):
        query = request.args.get('query')
    else:
        query = '20230601'

    res = requests.get(
        f"http://kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key=f5eef3421c602c6cb7ea224104795888&movieNm={query}"
    )
    rjson = res.json()
    movie_list = rjson["movieListResult"]["movieList"]
    return render_template('movie.html', data=movie_list)


@app.route("/answer")
def answer():
    if (request.args.get('query')):
        query = request.args.get('query')
    else:
        query = '20230601'

    URL = f"http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt={query}"
    res = requests.get(URL)
    rjson = res.json()
    movie_list = rjson['boxOfficeResult']['weeklyBoxOfficeList']

    return render_template("answer.html", data=movie_list)

@app.route("/answer_re")
def answer_re():
    if(request.args.get('query')):
        query = request.args.get('query')
    else:
        query = '20230601'
        
    URL = f"http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt={query}"

    res = requests.get(URL)
    rjson = res.json()
    movie_list = rjson['boxOfficeResult']['weeklyBoxOfficeList']

    return render_template("answer.html",data=movie_list)



if __name__ == '__main__':
    app.run(debug=True)
