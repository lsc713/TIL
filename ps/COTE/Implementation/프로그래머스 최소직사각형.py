def solution(sizes):
    max_width=max_height =0

    width = 0;
    height = 0;
    for size in sizes:
        width, height = size

        max_width = max(max_width,width,height)
        max_height = max(max_height,min(width,height))
        print(max_width*max_height)

    return max_height*max_width


solution([[60, 50], [30, 70], [60, 30], [80, 40]]	)