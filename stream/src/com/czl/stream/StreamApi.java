package com.czl.stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Stream源码
 * @author chenzhilong9
 * @date 2020-08-31
 */
public class StreamApi {
    /**
     *一个集合流，支持顺序和并行聚合操作
     */

    /**
     * A sequence of elements supporting sequential and parallel aggregate
     * operations.  The following example illustrates an aggregate operation using
     * {@link Stream} and {@link IntStream}:
     *
     * <pre>{@code
     *     int sum = widgets.stream()
     *                      .filter(w -> w.getColor() == RED)
     *                      .mapToInt(w -> w.getWeight())
     *                      .sum();
     * }</pre>
     *
     * In this example, {@code widgets} is a {@code Collection<Widget>}.  We create
     * a stream of {@code Widget} objects via {@link Collection#stream Collection.stream()},
     * filter it to produce a stream containing only the red widgets, and then
     * transform it into a stream of {@code int} values representing the weight of
     * each red widget. Then this stream is summed to produce a total weight.
     *
     * <p>In addition to {@code Stream}, which is a stream of object references,
     * there are primitive specializations for {@link IntStream}, {@link LongStream},
     * and {@link DoubleStream}, all of which are referred to as "streams" and
     * conform to the characteristics and restrictions described here.
     *
     * <p>To perform a computation, stream
     * <a href="package-summary.html#StreamOps">operations</a> are composed into a
     * <em>stream pipeline</em>.  A stream pipeline consists of a source (which
     * might be an array, a collection, a generator function, an I/O channel,
     * etc), zero or more <em>intermediate operations</em> (which transform a
     * stream into another stream, such as {@link Stream#filter(Predicate)}), and a
     * <em>terminal operation</em> (which produces a result or side-effect, such
     * as {@link Stream#count()} or {@link Stream#forEach(Consumer)}).
     * Streams are lazy; computation on the source data is only performed when the
     * terminal operation is initiated, and source elements are consumed only
     * as needed.
     *
     * <p>Collections and streams, while bearing some superficial similarities,
     * have different goals.  Collections are primarily concerned with the efficient
     * management of, and access to, their elements.  By contrast, streams do not
     * provide a means to directly access or manipulate their elements, and are
     * instead concerned with declaratively describing their source and the
     * computational operations which will be performed in aggregate on that source.
     * However, if the provided stream operations do not offer the desired
     * functionality, the {@link #iterator()} and {@link #spliterator()} operations
     * can be used to perform a controlled traversal.
     *
     * <p>A stream pipeline, like the "widgets" example above, can be viewed as
     * a <em>query</em> on the stream source.  Unless the source was explicitly
     * designed for concurrent modification (such as a {@link ConcurrentHashMap}),
     * unpredictable or erroneous behavior may result from modifying the stream
     * source while it is being queried.
     *
     * <p>Most stream operations accept parameters that describe user-specified
     * behavior, such as the lambda expression {@code w -> w.getWeight()} passed to
     * {@code mapToInt} in the example above.  To preserve correct behavior,
     * these <em>behavioral parameters</em>:
     * <ul>
     * <li>must be <a href="package-summary.html#NonInterference">non-interfering</a>
     * (they do not modify the stream source); and</li>
     * <li>in most cases must be <a href="package-summary.html#Statelessness">stateless</a>
     * (their result should not depend on any state that might change during execution
     * of the stream pipeline).</li>
     * </ul>
     *
     * <p>Such parameters are always instances of a
     * <a href="../function/package-summary.html">functional interface</a> such
     * as {@link java.util.function.Function}, and are often lambda expressions or
     * method references.  Unless otherwise specified these parameters must be
     * <em>non-null</em>.
     *
     * <p>A stream should be operated on (invoking an intermediate or terminal stream
     * operation) only once.  This rules out, for example, "forked" streams, where
     * the same source feeds two or more pipelines, or multiple traversals of the
     * same stream.  A stream implementation may throw {@link IllegalStateException}
     * if it detects that the stream is being reused. However, since some stream
     * operations may return their receiver rather than a new stream object, it may
     * not be possible to detect reuse in all cases.
     *
     * <p>Streams have a {@link #close()} method and implement {@link AutoCloseable},
     * but nearly all stream instances do not actually need to be closed after use.
     * Generally, only streams whose source is an IO channel (such as those returned
     * by {@link Files#lines(Path, Charset)}) will require closing.  Most streams
     * are backed by collections, arrays, or generating functions, which require no
     * special resource management.  (If a stream does require closing, it can be
     * declared as a resource in a {@code try}-with-resources statement.)
     *
     * <p>Stream pipelines may execute either sequentially or in
     * <a href="package-summary.html#Parallelism">parallel</a>.  This
     * execution mode is a property of the stream.  Streams are created
     * with an initial choice of sequential or parallel execution.  (For example,
     * {@link Collection#stream() Collection.stream()} creates a sequential stream,
     * and {@link Collection#parallelStream() Collection.parallelStream()} creates
     * a parallel one.)  This choice of execution mode may be modified by the
     * {@link #sequential()} or {@link #parallel()} methods, and may be queried with
     * the {@link #isParallel()} method.
     *
     * @param <T> the type of the stream elements
     * @since 1.8
     * @see IntStream
     * @see LongStream
     * @see DoubleStream
     * @see <a href="package-summary.html">java.util.stream</a>
     */
}
