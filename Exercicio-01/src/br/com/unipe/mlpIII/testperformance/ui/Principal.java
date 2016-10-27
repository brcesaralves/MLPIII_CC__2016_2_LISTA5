package br.com.unipe.mlpIII.testperformance.ui;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();
		Set<Integer> treeSet = new TreeSet<>();
		int total = 30000;
		
		//====================== Teste de Performace  LinkedList ======================
		
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			linkedList.add(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tempo Gasto pela LinkedList na Inserção: " + tempo + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			linkedList.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		
		System.out.println("Tempo Gasto pela LinkedList na Pesquisa: " + tempo + " ms");
		
		//=============================================================================
		
		//====================== Teste de Performace  ArrayList =======================
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			arrayList.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		
		System.out.println("Tempo Gasto pela ArrayList na Inserção: " + tempo + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			arrayList.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		
		System.out.println("Tempo Gasto pela ArrayList na Pesquisa: " + tempo + " ms");
		
		//=============================================================================
		
		//======================= Teste de Performace  TreeSet ========================
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			treeSet.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		
		System.out.println("Tempo Gasto pela TreeSet na Inserção: " + tempo + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			treeSet.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		
		System.out.println("Tempo Gasto pela TreeSet na Pesquisa: " + tempo + " ms");
		
		//=============================================================================
		
	}

}
