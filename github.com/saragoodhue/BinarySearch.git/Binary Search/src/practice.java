
public class practice
	{
		public static void main(String[] args)
			{
				int[] fred = {1,8,12,14,25,26,37,38,49,50};
				System.out.println(binarySearch(fred, 38));
			
			}
		public static int binarySearch(int[] elements, int target)
			{
				int left = 0;
				int right = elements.length - 1;
				while (left <= right)
					{
						int mid = (left + right) / 2;
						if (target == elements[mid])
							{
								return mid;
							} else if (target < elements[mid])
							{
								right = mid - 1;
							} else
							{
								left = mid + 1;
							}
					}
				return -1;
			}

	}
