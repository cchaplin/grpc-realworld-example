package realworld.infrastructure.grpc;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Message;

public interface GrpcRequestProcessor<Request extends Message, Response extends Message> {

  public ListenableFuture<Response> execute(Request request);
}
