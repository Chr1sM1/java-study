package com.soft2028.qs.computerTest;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/22
 **/
public class Test {


        public static void main(String[] args) {
            CPU cpu=new CPU();
            cpu.setSpeed(2200);
            HardDisk disk = new HardDisk();
            disk.setAmount(200);
            PC pc = new PC();
            pc.setCPU(cpu);
            pc.setHardDisk(disk);
            pc.show();
        }
    }
