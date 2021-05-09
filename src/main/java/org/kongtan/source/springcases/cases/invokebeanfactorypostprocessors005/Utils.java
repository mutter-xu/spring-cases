package org.kongtan.source.springcases.cases.invokebeanfactorypostprocessors005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author admin
 * @Description TODO 在日志中打印出当前线程的执行堆栈
 * @createTime 2021年05月09日 20:10:00
 */
public class Utils {

    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    /**
     * 打印当前线程堆栈信息
     * @param prefix
     */
    public static void printTrack(String prefix){
        StackTraceElement[] st = Thread.currentThread().getStackTrace();

        if(null==st){
            logger.info("invalid stack");
            return;
        }

        StringBuffer sbf =new StringBuffer();

        for(StackTraceElement e:st){
            if(sbf.length()>0){
                sbf.append(" <- ");
                sbf.append(System.getProperty("line.separator"));
            }

            sbf.append(java.text.MessageFormat.format("{0}.{1}() {2}"
                    ,e.getClassName()
                    ,e.getMethodName()
                    ,e.getLineNumber()));
        }

        logger.info(prefix
                + "\n************************************************************\n"
                + sbf.toString()
                + "\n************************************************************");
    }
}
