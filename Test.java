package test;

import java.util.Scanner;

import entity.Pet;
import service.PetService;
import service.impl.PetServiceImpl;

public class Test {

	public static void main(String[] args) {
		PetService petService=new PetServiceImpl();
		Scanner input=new Scanner(System.in);	
		Pet pet=new Pet();
		System.out.println("请输入姓名：");
		pet.setName(input.next());
		System.out.println("请输入健康值：");
		pet.setHealth(input.nextInt());
		System.out.println("请输入请密度：");
		pet.setLove(input.nextInt());
		System.out.println("请输入品种：");
		pet.setStrain(input.next());
		boolean isSuccess=petService.register(pet);
		if(isSuccess) {
			System.out.println("注册成功");
		}else {
			System.out.println("注册失败");
		}

	}

}
