import collections
def solution(participant, completion):
    # participant.sort()
    # completion.sort()
    # for i in range(len(completion)):
    #     if participant[i] != completion[i]:
    #         return participant[i]
    # return participant[-1]

    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0]
print(solution(["leo", "kiki", "eden"],["eden", "kiki"]))