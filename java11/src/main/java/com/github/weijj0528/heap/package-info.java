/**
 * 低开销的 Heap Profiling
 * Java 11 中提供一种低开销的 Java 堆分配采样方法，能够得到堆分配的 Java 对象信息，并且能够通过 JVMTI 访问堆信息。
 * <p>
 * 引入这个低开销内存分析工具是为了达到如下目的：
 * <p>
 * - 足够低的开销，可以默认且一直开启
 * - 能通过定义好的程序接口访问
 * - 能够对所有堆分配区域进行采样
 * - 能给出正在和未被使用的 Java 对象信息
 */
package com.github.weijj0528.heap;