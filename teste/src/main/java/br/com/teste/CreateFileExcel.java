package br.com.teste;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.List;

public class CreateFileExcel {

    private static final String fileName01 = "c:/oi-atende/Relatorio_Acompanhamento_Chamado.xls"; // destino para extensões .xls
    private static final String fileName02 = "c:/oi-atende/Relatorio_Acompanhamento_Chamado.xslx"; // destino para exrensões .xslx
    private static String protocolo;
    private static String numero;
    private static String ds_mensagem;
    private static String dt_recebimento;
    private static String dt_primeira;
    private static String status;
    private static String login;
    private static String nome;
    private static String dt_finalizacao;
    private static String intermediacao;


    public static void main(String[] args) {

        try {

            // para versões antigas
            HSSFWorkbook createFileXSL = new HSSFWorkbook(); // classe que cria o arquivo
            HSSFSheet sheetRelatorio = createFileXSL.createSheet("Relatório de Acompanhamento de Chamados"); // classe que cria a planilha

            List<DadosRelatorio> listaRelatorio01 = new ArrayList<DadosRelatorio>();
            listaRelatorio01.add(new DadosRelatorio(protocolo, numero, ds_mensagem, dt_recebimento, dt_primeira, status, login, nome, dt_finalizacao, intermediacao));

            int rowNum = 0;
            int cellNum = 0;

            for (DadosRelatorio dados : listaRelatorio01) {

                Row linha = sheetRelatorio.createRow(rowNum++);

                Cell celula01 = linha.createCell(cellNum++);
                celula01.setCellValue(dados.getProtocolo());

                Cell celula02 = linha.createCell(cellNum++);
                celula02.setCellValue(dados.getNumero());

                Cell celula03 = linha.createCell(cellNum++);
                celula03.setCellValue(dados.getDs_mensagem());

                Cell celula04 = linha.createCell(cellNum++);
                celula04.setCellValue(dados.getDt_recebimento());

                Cell celula05 = linha.createCell(cellNum++);
                celula05.setCellValue(dados.getDt_primeira());

                Cell celula06 = linha.createCell(cellNum++);
                celula06.setCellValue(dados.getStatus());

                Cell celula07 = linha.createCell(cellNum++);
                celula07.setCellValue(dados.getLogin());

                Cell celula08 = linha.createCell(cellNum++);
                celula08.setCellValue(dados.getNome());

                Cell celula09 = linha.createCell(cellNum++);
                celula09.setCellValue(dados.getDt_finalizacao());

                Cell celula10 = linha.createCell(cellNum++);
                celula10.setCellValue(dados.getIntermediacao());

            }

        } catch (Exception e) {

            XSSFWorkbook createFileXSLX = new XSSFWorkbook();
            XSSFSheet sheetRelatorio = createFileXSLX.createSheet("Relatório de Acompanhamento de Chamados"); // classe que cria a planilha);

            List<DadosRelatorio> listaRelatorio02 = new ArrayList<DadosRelatorio>();
            listaRelatorio02.add(new DadosRelatorio(protocolo, numero, ds_mensagem, dt_recebimento, dt_primeira, status, login, nome, dt_finalizacao, intermediacao));

            int rowNum = 0;
            int cellNum = 0;

            for (DadosRelatorio dados : listaRelatorio02) {

                Row linha = sheetRelatorio.createRow(rowNum++);

                Cell celula01 = linha.createCell(cellNum++);
                celula01.setCellValue(dados.getProtocolo());

                Cell celula02 = linha.createCell(cellNum++);
                celula02.setCellValue(dados.getNumero());

                Cell celula03 = linha.createCell(cellNum++);
                celula03.setCellValue(dados.getDs_mensagem());

                Cell celula04 = linha.createCell(cellNum++);
                celula04.setCellValue(dados.getDt_recebimento());

                Cell celula05 = linha.createCell(cellNum++);
                celula05.setCellValue(dados.getDt_primeira());

                Cell celula06 = linha.createCell(cellNum++);
                celula06.setCellValue(dados.getStatus());

                Cell celula07 = linha.createCell(cellNum++);
                celula07.setCellValue(dados.getLogin());

                Cell celula08 = linha.createCell(cellNum++);
                celula08.setCellValue(dados.getNome());

                Cell celula09 = linha.createCell(cellNum++);
                celula09.setCellValue(dados.getDt_finalizacao());

                Cell celula10 = linha.createCell(cellNum++);
                celula10.setCellValue(dados.getIntermediacao());

            }
        }
    }
}
